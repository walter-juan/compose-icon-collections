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

public val OthersGroup.CharacterRecognitionFill: ImageVector
    get() {
        if (_characterRecognitionFill != null) {
            return _characterRecognitionFill!!
        }
        _characterRecognitionFill = Builder(name = "CharacterRecognitionFill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.998f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.998f)
                close()
                moveTo(12.997f, 6.0f)
                horizontalLineTo(10.997f)
                lineTo(6.598f, 17.0f)
                horizontalLineTo(8.752f)
                lineTo(9.951f, 14.0f)
                horizontalLineTo(14.041f)
                lineTo(15.242f, 17.0f)
                horizontalLineTo(17.397f)
                lineTo(12.997f, 6.0f)
                close()
                moveTo(11.997f, 8.885f)
                lineTo(13.242f, 12.0f)
                horizontalLineTo(10.75f)
                lineTo(11.997f, 8.885f)
                close()
            }
        }
        .build()
        return _characterRecognitionFill!!
    }

private var _characterRecognitionFill: ImageVector? = null
