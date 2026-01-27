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

public val CommunicationGroup.TextToSpeechLine: ImageVector
    get() {
        if (_textToSpeechLine != null) {
            return _textToSpeechLine!!
        }
        _textToSpeechLine = Builder(name = "TextToSpeechLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 5.0f, 4.0f, 5.895f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.105f, 4.895f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 19.0f, 20.0f, 18.105f, 20.0f, 17.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 19.209f, 20.209f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 21.0f, 2.0f, 19.209f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 4.791f, 3.791f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(20.657f, 1.343f)
                curveTo(22.105f, 2.79f, 23.0f, 4.791f, 23.0f, 7.0f)
                curveTo(23.0f, 9.209f, 22.105f, 11.21f, 20.657f, 12.657f)
                lineTo(19.242f, 11.242f)
                curveTo(20.328f, 10.156f, 21.0f, 8.657f, 21.0f, 7.0f)
                curveTo(21.0f, 5.343f, 20.328f, 3.844f, 19.242f, 2.758f)
                lineTo(20.657f, 1.343f)
                close()
                moveTo(17.828f, 4.172f)
                curveTo(18.552f, 4.896f, 19.0f, 5.895f, 19.0f, 7.0f)
                curveTo(19.0f, 8.105f, 18.552f, 9.104f, 17.828f, 9.828f)
                lineTo(16.414f, 8.414f)
                curveTo(16.776f, 8.052f, 17.0f, 7.552f, 17.0f, 7.0f)
                curveTo(17.0f, 6.448f, 16.776f, 5.948f, 16.414f, 5.586f)
                lineTo(17.828f, 4.172f)
                close()
            }
        }
        .build()
        return _textToSpeechLine!!
    }

private var _textToSpeechLine: ImageVector? = null
