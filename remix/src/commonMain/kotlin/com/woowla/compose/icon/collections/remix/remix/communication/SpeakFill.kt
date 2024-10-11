package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.SpeakFill: ImageVector
    get() {
        if (_speakFill != null) {
            return _speakFill!!
        }
        _speakFill = Builder(name = "SpeakFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(13.068f, 2.0f, 16.426f, 5.036f, 16.934f, 8.965f)
                lineTo(19.184f, 12.504f)
                curveTo(19.332f, 12.737f, 19.302f, 13.085f, 18.959f, 13.232f)
                lineTo(17.0f, 14.071f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 18.105f, 16.105f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.001f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 18.306f)
                curveTo(4.0f, 17.125f, 3.564f, 16.009f, 2.756f, 15.001f)
                curveTo(1.657f, 13.631f, 1.0f, 11.892f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(21.153f, 18.102f)
                lineTo(19.489f, 16.993f)
                curveTo(20.444f, 15.564f, 21.0f, 13.847f, 21.0f, 12.0f)
                curveTo(21.0f, 10.153f, 20.444f, 8.436f, 19.489f, 7.007f)
                lineTo(21.153f, 5.898f)
                curveTo(22.32f, 7.644f, 23.0f, 9.743f, 23.0f, 12.0f)
                curveTo(23.0f, 14.258f, 22.32f, 16.356f, 21.153f, 18.102f)
                close()
            }
        }
        .build()
        return _speakFill!!
    }

private var _speakFill: ImageVector? = null
