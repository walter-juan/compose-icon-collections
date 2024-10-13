package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlVisualStudio: ImageVector
    get() {
        if (_bxlVisualStudio != null) {
            return _bxlVisualStudio!!
        }
        _bxlVisualStudio = Builder(name = "BxlVisualStudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.29f, 4.1f)
                lineToRelative(-4.12f, -2.0f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, -0.48f, -0.1f)
                horizontalLineToRelative(-0.08f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.72f, 0.24f)
                lineToRelative(-0.14f, 0.12f)
                lineToRelative(-7.88f, 7.19f)
                lineTo(4.44f, 7.0f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, -0.54f, -0.17f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.53f, 0.17f)
                lineToRelative(-1.1f, 1.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.27f, 0.61f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.27f, 0.62f)
                lineToRelative(3.0f, 2.71f)
                lineToRelative(-3.0f, 2.72f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.0f, 1.23f)
                lineToRelative(1.1f, 1.0f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.6f, 0.22f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.47f, -0.17f)
                lineToRelative(3.43f, -2.61f)
                lineToRelative(7.88f, 7.19f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.76f, 0.36f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.49f, -0.12f)
                lineToRelative(4.12f, -2.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.71f, -1.1f)
                verticalLineTo(5.23f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.71f, -1.13f)
                close()
                moveTo(17.0f, 16.47f)
                lineToRelative(-6.0f, -4.53f)
                lineToRelative(6.0f, -4.53f)
                close()
            }
        }
        .build()
        return _bxlVisualStudio!!
    }

private var _bxlVisualStudio: ImageVector? = null
