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

public val SolidGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 48.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                lineToRelative(0.0f, 40.0f)
                lineTo(176.0f, 96.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(128.0f, 56.0f)
                lineToRelative(0.0f, 40.0f)
                lineTo(64.0f, 96.0f)
                curveTo(28.7f, 96.0f, 0.0f, 124.7f, 0.0f, 160.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(184.0f, 0.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, 25.1f, -56.0f, 56.0f)
                close()
                moveTo(512.0f, 288.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineTo(0.0f, 288.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
