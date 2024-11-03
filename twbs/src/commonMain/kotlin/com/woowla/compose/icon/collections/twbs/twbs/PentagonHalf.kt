package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PentagonHalf: ImageVector
    get() {
        if (_pentagonHalf != null) {
            return _pentagonHalf!!
        }
        _pentagonHalf = Builder(name = "PentagonHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 1.288f)
                lineToRelative(6.578f, 5.345f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.161f, 0.539f)
                lineToRelative(-2.362f, 7.479f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.476f, 0.349f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(15.898f, 6.824f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.162f, -0.538f)
                lineTo(8.316f, 0.256f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.631f, 0.0f)
                lineTo(0.264f, 6.286f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.162f, 0.538f)
                lineToRelative(2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.476f, 0.349f)
                horizontalLineToRelative(9.268f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.476f, -0.35f)
                close()
            }
        }
        .build()
        return _pentagonHalf!!
    }

private var _pentagonHalf: ImageVector? = null
