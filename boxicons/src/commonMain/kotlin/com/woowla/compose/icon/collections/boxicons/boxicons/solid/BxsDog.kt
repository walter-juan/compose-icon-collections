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

public val SolidGroup.BxsDog: ImageVector
    get() {
        if (_bxsDog != null) {
            return _bxsDog!!
        }
        _bxsDog = Builder(name = "BxsDog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.27f, -1.27f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 16.0f, 4.0f)
                horizontalLineToRelative(-2.5f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 11.0f, 2.0f)
                verticalLineToRelative(6.36f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, 1.13f, 2.72f)
                arcToRelative(6.57f, 6.57f, 0.0f, false, false, 4.13f, 1.82f)
                lineToRelative(3.45f, -1.38f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.73f, -1.84f)
                lineTo(22.0f, 8.15f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 0.0f, -0.31f)
                lineTo(22.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.38f, 11.74f)
                arcTo(5.24f, 5.24f, 0.0f, false, true, 10.07f, 9.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(4.69f, 4.69f, 0.0f, false, false, 0.48f, 2.0f)
                arcTo(3.58f, 3.58f, 0.0f, false, false, 4.0f, 10.53f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.13f)
                arcToRelative(7.35f, 7.35f, 0.0f, false, true, -4.62f, -2.13f)
                close()
            }
        }
        .build()
        return _bxsDog!!
    }

private var _bxsDog: ImageVector? = null
