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

public val EditorGroup.LinkM: ImageVector
    get() {
        if (_linkM != null) {
            return _linkM!!
        }
        _linkM = Builder(name = "LinkM", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 14.828f)
                lineTo(16.243f, 13.414f)
                lineTo(17.657f, 12.0f)
                curveTo(19.219f, 10.438f, 19.219f, 7.905f, 17.657f, 6.343f)
                curveTo(16.095f, 4.781f, 13.562f, 4.781f, 12.0f, 6.343f)
                lineTo(10.586f, 7.757f)
                lineTo(9.171f, 6.343f)
                lineTo(10.586f, 4.929f)
                curveTo(12.929f, 2.586f, 16.728f, 2.586f, 19.071f, 4.929f)
                curveTo(21.414f, 7.272f, 21.414f, 11.071f, 19.071f, 13.414f)
                lineTo(17.657f, 14.828f)
                close()
                moveTo(14.828f, 17.657f)
                lineTo(13.414f, 19.071f)
                curveTo(11.071f, 21.414f, 7.272f, 21.414f, 4.929f, 19.071f)
                curveTo(2.586f, 16.728f, 2.586f, 12.929f, 4.929f, 10.586f)
                lineTo(6.343f, 9.172f)
                lineTo(7.757f, 10.586f)
                lineTo(6.343f, 12.0f)
                curveTo(4.781f, 13.562f, 4.781f, 16.095f, 6.343f, 17.657f)
                curveTo(7.905f, 19.219f, 10.438f, 19.219f, 12.0f, 17.657f)
                lineTo(13.414f, 16.243f)
                lineTo(14.828f, 17.657f)
                close()
                moveTo(14.828f, 7.757f)
                lineTo(16.243f, 9.172f)
                lineTo(9.171f, 16.243f)
                lineTo(7.757f, 14.828f)
                lineTo(14.828f, 7.757f)
                close()
            }
        }
        .build()
        return _linkM!!
    }

private var _linkM: ImageVector? = null
