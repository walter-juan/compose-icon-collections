package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.Attachment2: ImageVector
    get() {
        if (_attachment2 != null) {
            return _attachment2!!
        }
        _attachment2 = Builder(name = "Attachment2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.829f, 7.757f)
                lineTo(9.172f, 13.414f)
                curveTo(8.781f, 13.805f, 8.781f, 14.438f, 9.172f, 14.828f)
                curveTo(9.562f, 15.219f, 10.196f, 15.219f, 10.586f, 14.828f)
                lineTo(16.243f, 9.172f)
                curveTo(17.414f, 8.0f, 17.414f, 6.101f, 16.243f, 4.929f)
                curveTo(15.071f, 3.757f, 13.172f, 3.757f, 12.0f, 4.929f)
                lineTo(6.343f, 10.586f)
                curveTo(4.391f, 12.538f, 4.391f, 15.704f, 6.343f, 17.657f)
                curveTo(8.296f, 19.61f, 11.462f, 19.61f, 13.414f, 17.657f)
                lineTo(19.071f, 12.0f)
                lineTo(20.486f, 13.414f)
                lineTo(14.829f, 19.071f)
                curveTo(12.095f, 21.805f, 7.663f, 21.805f, 4.929f, 19.071f)
                curveTo(2.195f, 16.337f, 2.195f, 11.905f, 4.929f, 9.172f)
                lineTo(10.586f, 3.515f)
                curveTo(12.539f, 1.562f, 15.705f, 1.562f, 17.657f, 3.515f)
                curveTo(19.61f, 5.467f, 19.61f, 8.633f, 17.657f, 10.586f)
                lineTo(12.0f, 16.243f)
                curveTo(10.829f, 17.414f, 8.929f, 17.414f, 7.758f, 16.243f)
                curveTo(6.586f, 15.071f, 6.586f, 13.172f, 7.758f, 12.0f)
                lineTo(13.414f, 6.343f)
                lineTo(14.829f, 7.757f)
                close()
            }
        }
        .build()
        return _attachment2!!
    }

private var _attachment2: ImageVector? = null
