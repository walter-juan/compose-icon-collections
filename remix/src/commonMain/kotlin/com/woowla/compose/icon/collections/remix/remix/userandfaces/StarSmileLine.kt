package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.StarSmileLine: ImageVector
    get() {
        if (_starSmileLine != null) {
            return _starSmileLine!!
        }
        _starSmileLine = Builder(name = "StarSmileLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                lineTo(16.226f, 6.683f)
                lineTo(23.412f, 8.792f)
                lineTo(18.837f, 14.722f)
                lineTo(19.053f, 22.208f)
                lineTo(12.0f, 19.69f)
                lineTo(4.946f, 22.208f)
                lineTo(5.162f, 14.722f)
                lineTo(0.587f, 8.792f)
                lineTo(7.774f, 6.683f)
                lineTo(12.0f, 0.5f)
                close()
                moveTo(12.0f, 4.044f)
                lineTo(9.022f, 8.402f)
                lineTo(3.957f, 9.887f)
                lineTo(7.182f, 14.066f)
                lineTo(7.029f, 19.34f)
                lineTo(12.0f, 17.566f)
                lineTo(16.97f, 19.34f)
                lineTo(16.818f, 14.066f)
                lineTo(20.042f, 9.887f)
                lineTo(14.977f, 8.402f)
                lineTo(12.0f, 4.044f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                curveTo(13.104f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                curveTo(9.79f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _starSmileLine!!
    }

private var _starSmileLine: ImageVector? = null
