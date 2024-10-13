package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMessageSquareDots: ImageVector
    get() {
        if (_bxsMessageSquareDots != null) {
            return _bxsMessageSquareDots!!
        }
        _bxsMessageSquareDots = Builder(name = "BxsMessageSquareDots", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                curveTo(4.691f, 2.0f, 2.0f, 4.691f, 2.0f, 8.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(11.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 14.0f)
                curveToRelative(-0.086f, 0.0f, -0.168f, -0.011f, -0.25f, -0.025f)
                curveToRelative(-0.083f, 0.01f, -0.164f, 0.025f, -0.25f, 0.025f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                curveToRelative(0.0f, 0.085f, -0.015f, 0.167f, -0.025f, 0.25f)
                curveToRelative(0.013f, 0.082f, 0.025f, 0.164f, 0.025f, 0.25f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(-0.086f, 0.0f, -0.167f, -0.015f, -0.25f, -0.025f)
                arcToRelative(1.471f, 1.471f, 0.0f, false, true, -0.25f, 0.025f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.085f, 0.012f, -0.168f, 0.025f, -0.25f)
                curveToRelative(-0.01f, -0.083f, -0.025f, -0.164f, -0.025f, -0.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsMessageSquareDots!!
    }

private var _bxsMessageSquareDots: ImageVector? = null
