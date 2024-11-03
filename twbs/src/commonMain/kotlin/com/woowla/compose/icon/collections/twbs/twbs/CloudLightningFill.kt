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

public val Twbs.CloudLightningFill: ImageVector
    get() {
        if (_cloudLightningFill != null) {
            return _cloudLightningFill!!
        }
        _cloudLightningFill = Builder(name = "CloudLightningFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.053f, 11.276f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.658f)
                lineToRelative(-0.28f, 0.842f)
                lineTo(9.5f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.39f, 0.812f)
                lineToRelative(-2.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.875f, -0.433f)
                lineTo(7.36f, 14.0f)
                lineTo(6.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.447f, -0.724f)
                close()
                moveTo(13.405f, 4.027f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 10.0f)
                lineTo(13.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
            }
        }
        .build()
        return _cloudLightningFill!!
    }

private var _cloudLightningFill: ImageVector? = null
