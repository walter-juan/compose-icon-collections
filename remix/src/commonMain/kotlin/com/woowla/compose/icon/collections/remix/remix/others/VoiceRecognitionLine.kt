package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.VoiceRecognitionLine: ImageVector
    get() {
        if (_voiceRecognitionLine != null) {
            return _voiceRecognitionLine!!
        }
        _voiceRecognitionLine = Builder(name = "VoiceRecognitionLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.998f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.998f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.998f)
                close()
                moveTo(20.998f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.998f)
                close()
                moveTo(12.998f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.998f)
                close()
                moveTo(8.998f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.998f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.998f)
                close()
                moveTo(16.998f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.998f)
                close()
                moveTo(8.998f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.998f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.998f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.998f)
                close()
                moveTo(20.998f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.998f)
                close()
            }
        }
        .build()
        return _voiceRecognitionLine!!
    }

private var _voiceRecognitionLine: ImageVector? = null
