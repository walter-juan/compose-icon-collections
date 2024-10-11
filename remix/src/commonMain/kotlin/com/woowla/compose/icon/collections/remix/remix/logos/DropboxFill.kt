package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.DropboxFill: ImageVector
    get() {
        if (_dropboxFill != null) {
            return _dropboxFill!!
        }
        _dropboxFill = Builder(name = "DropboxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.285f, 10.668f)
                lineTo(22.5f, 13.991f)
                lineTo(17.248f, 17.337f)
                lineTo(12.0f, 13.993f)
                lineTo(6.752f, 17.337f)
                lineTo(1.5f, 13.991f)
                lineTo(6.715f, 10.668f)
                lineTo(1.5f, 7.346f)
                lineTo(6.752f, 4.0f)
                lineTo(12.0f, 7.343f)
                lineTo(17.248f, 4.0f)
                lineTo(22.5f, 7.346f)
                lineTo(17.285f, 10.668f)
                close()
                moveTo(17.211f, 10.668f)
                lineTo(12.0f, 7.348f)
                lineTo(6.789f, 10.668f)
                lineTo(12.0f, 13.988f)
                lineTo(17.211f, 10.668f)
                close()
                moveTo(6.786f, 18.446f)
                lineTo(12.038f, 15.1f)
                lineTo(17.29f, 18.446f)
                lineTo(12.038f, 21.792f)
                lineTo(6.786f, 18.446f)
                close()
            }
        }
        .build()
        return _dropboxFill!!
    }

private var _dropboxFill: ImageVector? = null
