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

public val EditorGroup.LinkUnlinkM: ImageVector
    get() {
        if (_linkUnlinkM != null) {
            return _linkUnlinkM!!
        }
        _linkUnlinkM = Builder(name = "LinkUnlinkM", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 14.828f)
                lineTo(16.243f, 13.414f)
                lineTo(17.657f, 12.0f)
                curveTo(19.219f, 10.438f, 19.219f, 7.905f, 17.657f, 6.343f)
                curveTo(16.095f, 4.781f, 13.562f, 4.781f, 12.0f, 6.343f)
                lineTo(10.586f, 7.757f)
                lineTo(9.172f, 6.343f)
                lineTo(10.586f, 4.929f)
                curveTo(12.929f, 2.586f, 16.728f, 2.586f, 19.071f, 4.929f)
                curveTo(21.414f, 7.272f, 21.414f, 11.071f, 19.071f, 13.414f)
                lineTo(17.657f, 14.828f)
                close()
                moveTo(14.829f, 17.657f)
                lineTo(13.414f, 19.071f)
                curveTo(11.071f, 21.414f, 7.272f, 21.414f, 4.929f, 19.071f)
                curveTo(2.586f, 16.728f, 2.586f, 12.929f, 4.929f, 10.586f)
                lineTo(6.343f, 9.172f)
                lineTo(7.757f, 10.586f)
                lineTo(6.343f, 12.0f)
                curveTo(4.781f, 13.562f, 4.781f, 16.095f, 6.343f, 17.657f)
                curveTo(7.905f, 19.219f, 10.438f, 19.219f, 12.0f, 17.657f)
                lineTo(13.414f, 16.243f)
                lineTo(14.829f, 17.657f)
                close()
                moveTo(14.829f, 7.757f)
                lineTo(16.243f, 9.172f)
                lineTo(9.172f, 16.243f)
                lineTo(7.757f, 14.828f)
                lineTo(14.829f, 7.757f)
                close()
                moveTo(5.775f, 2.293f)
                lineTo(7.707f, 1.775f)
                lineTo(8.743f, 5.639f)
                lineTo(6.811f, 6.157f)
                lineTo(5.775f, 2.293f)
                close()
                moveTo(15.258f, 18.361f)
                lineTo(17.19f, 17.843f)
                lineTo(18.225f, 21.707f)
                lineTo(16.293f, 22.225f)
                lineTo(15.258f, 18.361f)
                close()
                moveTo(2.293f, 5.775f)
                lineTo(6.157f, 6.811f)
                lineTo(5.639f, 8.742f)
                lineTo(1.775f, 7.707f)
                lineTo(2.293f, 5.775f)
                close()
                moveTo(18.361f, 15.258f)
                lineTo(22.225f, 16.293f)
                lineTo(21.707f, 18.225f)
                lineTo(17.844f, 17.19f)
                lineTo(18.361f, 15.258f)
                close()
            }
        }
        .build()
        return _linkUnlinkM!!
    }

private var _linkUnlinkM: ImageVector? = null
