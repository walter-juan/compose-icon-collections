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

public val UserAndFacesGroup.StarSmileFill: ImageVector
    get() {
        if (_starSmileFill != null) {
            return _starSmileFill!!
        }
        _starSmileFill = Builder(name = "StarSmileFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.0f, 12.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 14.209f, 9.79f, 16.0f, 12.0f, 16.0f)
                curveTo(14.142f, 16.0f, 15.891f, 14.316f, 15.995f, 12.2f)
                lineTo(16.0f, 12.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 13.105f, 13.104f, 14.0f, 12.0f, 14.0f)
                curveTo(10.945f, 14.0f, 10.081f, 13.184f, 10.005f, 12.149f)
                lineTo(10.0f, 12.0f)
                close()
            }
        }
        .build()
        return _starSmileFill!!
    }

private var _starSmileFill: ImageVector? = null
