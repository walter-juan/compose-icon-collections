package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PhoneFlip: ImageVector
    get() {
        if (_phoneFlip != null) {
            return _phoneFlip!!
        }
        _phoneFlip = Builder(name = "PhoneFlip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(351.8f, 25.0f)
                curveToRelative(7.8f, -18.8f, 28.4f, -28.9f, 48.1f, -23.5f)
                lineToRelative(5.5f, 1.5f)
                curveToRelative(64.6f, 17.6f, 119.8f, 80.2f, 103.7f, 156.4f)
                curveToRelative(-37.1f, 175.0f, -174.8f, 312.7f, -349.8f, 349.8f)
                curveToRelative(-76.3f, 16.2f, -138.8f, -39.1f, -156.4f, -103.7f)
                lineToRelative(-1.5f, -5.5f)
                curveToRelative(-5.4f, -19.7f, 4.7f, -40.3f, 23.5f, -48.1f)
                lineToRelative(97.3f, -40.5f)
                curveToRelative(16.5f, -6.9f, 35.6f, -2.1f, 47.0f, 11.8f)
                lineToRelative(38.6f, 47.2f)
                curveToRelative(70.3f, -34.9f, 126.8f, -93.3f, 159.3f, -164.9f)
                lineToRelative(-44.1f, -36.1f)
                curveToRelative(-13.9f, -11.3f, -18.6f, -30.4f, -11.8f, -47.0f)
                lineTo(351.8f, 25.0f)
                close()
            }
        }
        .build()
        return _phoneFlip!!
    }

private var _phoneFlip: ImageVector? = null
