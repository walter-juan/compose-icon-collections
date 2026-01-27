package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.SquareXTwitter: ImageVector
    get() {
        if (_squareXTwitter != null) {
            return _squareXTwitter!!
        }
        _squareXTwitter = Builder(name = "SquareXTwitter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(361.1f, 116.0f)
                lineToRelative(-103.8f, 118.6f)
                lineToRelative(122.1f, 161.4f)
                lineToRelative(-95.6f, 0.0f)
                lineToRelative(-74.8f, -97.9f)
                lineToRelative(-85.7f, 97.9f)
                lineToRelative(-47.5f, 0.0f)
                lineToRelative(111.0f, -126.9f)
                lineToRelative(-117.1f, -153.1f)
                lineToRelative(98.0f, 0.0f)
                lineToRelative(67.7f, 89.5f)
                lineToRelative(78.2f, -89.5f)
                lineToRelative(47.5f, 0.0f)
                close()
                moveTo(323.3f, 367.6f)
                lineToRelative(-169.9f, -224.7f)
                lineToRelative(-28.3f, 0.0f)
                lineToRelative(171.8f, 224.7f)
                lineToRelative(26.4f, 0.0f)
                close()
            }
        }
        .build()
        return _squareXTwitter!!
    }

private var _squareXTwitter: ImageVector? = null
