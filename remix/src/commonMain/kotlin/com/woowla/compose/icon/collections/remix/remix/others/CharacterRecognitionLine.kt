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

public val OthersGroup.CharacterRecognitionLine: ImageVector
    get() {
        if (_characterRecognitionLine != null) {
            return _characterRecognitionLine!!
        }
        _characterRecognitionLine = Builder(name = "CharacterRecognitionLine", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(12.997f, 6.0f)
                lineTo(17.397f, 17.0f)
                horizontalLineTo(15.242f)
                lineTo(14.041f, 14.0f)
                horizontalLineTo(9.951f)
                lineTo(8.752f, 17.0f)
                horizontalLineTo(6.598f)
                lineTo(10.997f, 6.0f)
                horizontalLineTo(12.997f)
                close()
                moveTo(11.997f, 8.885f)
                lineTo(10.75f, 12.0f)
                horizontalLineTo(13.242f)
                lineTo(11.997f, 8.885f)
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
        return _characterRecognitionLine!!
    }

private var _characterRecognitionLine: ImageVector? = null
