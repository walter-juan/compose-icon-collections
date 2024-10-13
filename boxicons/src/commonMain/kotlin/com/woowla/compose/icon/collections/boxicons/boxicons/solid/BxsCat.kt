package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCat: ImageVector
    get() {
        if (_bxsCat != null) {
            return _bxsCat!!
        }
        _bxsCat = Builder(name = "BxsCat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.71f, -0.81f)
                lineTo(20.0f, 13.0f)
                arcToRelative(3.16f, 3.16f, 0.0f, false, false, 0.45f, -0.37f)
                lineToRelative(0.21f, -0.2f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, 0.48f, -0.58f)
                lineToRelative(0.06f, -0.08f)
                arcToRelative(4.28f, 4.28f, 0.0f, false, false, 0.41f, -0.76f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, false, 0.09f, -0.23f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, false, 0.2f, -0.63f)
                lineToRelative(0.06f, -0.25f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 9.0f)
                lineTo(22.0f, 2.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                close()
                moveTo(19.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.9f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -2.48f, -1.64f)
                arcTo(3.59f, 3.59f, 0.0f, false, true, 2.0f, 8.5f)
                arcTo(3.65f, 3.65f, 0.0f, false, true, 6.0f, 5.0f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, -4.0f, 4.0f)
                curveTo(4.19f, 7.0f, 4.0f, 8.16f, 4.0f, 8.51f)
                reflectiveCurveTo(4.18f, 10.0f, 6.0f, 10.0f)
                horizontalLineToRelative(5.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 19.0f, 14.65f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bxsCat!!
    }

private var _bxsCat: ImageVector? = null
