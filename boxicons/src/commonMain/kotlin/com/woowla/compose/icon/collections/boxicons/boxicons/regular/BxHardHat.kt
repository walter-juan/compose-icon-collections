package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxHardHat: ImageVector
    get() {
        if (_bxHardHat != null) {
            return _bxHardHat!!
        }
        _bxHardHat = Builder(name = "BxHardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                arcToRelative(9.11f, 9.11f, 0.0f, false, false, -0.18f, -1.81f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, false, -0.53f, -1.69f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -0.83f, -1.5f)
                arcToRelative(8.73f, 8.73f, 0.0f, false, false, -1.1f, -1.33f)
                arcTo(8.27f, 8.27f, 0.0f, false, false, 17.0f, 7.54f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -1.53f, -0.83f)
                lineTo(15.0f, 6.52f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.52f)
                lineToRelative(-0.5f, 0.19f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -1.5f, 0.83f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, -1.33f, 1.1f)
                arcTo(8.27f, 8.27f, 0.0f, false, false, 4.54f, 10.0f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -0.83f, 1.53f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.53f, 1.69f)
                arcTo(9.11f, 9.11f, 0.0f, false, false, 3.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 15.0f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, true, 0.14f, -1.41f)
                arcToRelative(6.64f, 6.64f, 0.0f, false, true, 0.41f, -1.31f)
                arcToRelative(7.15f, 7.15f, 0.0f, false, true, 0.64f, -1.19f)
                arcToRelative(7.15f, 7.15f, 0.0f, false, true, 1.9f, -1.9f)
                arcTo(7.33f, 7.33f, 0.0f, false, true, 9.0f, 8.68f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.68f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 0.91f, 0.51f)
                arcToRelative(7.09f, 7.09f, 0.0f, false, true, 1.0f, 0.86f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, true, 0.85f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.65f, 1.19f)
                arcToRelative(7.13f, 7.13f, 0.0f, false, true, 0.41f, 1.31f)
                arcTo(7.33f, 7.33f, 0.0f, false, true, 19.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _bxHardHat!!
    }

private var _bxHardHat: ImageVector? = null
