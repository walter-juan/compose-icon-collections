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

public val EditorGroup.LinkUnlink: ImageVector
    get() {
        if (_linkUnlink != null) {
            return _linkUnlink!!
        }
        _linkUnlink = Builder(name = "LinkUnlink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(18.364f, 15.535f)
                lineTo(16.95f, 14.121f)
                lineTo(18.364f, 12.707f)
                curveTo(20.317f, 10.755f, 20.317f, 7.589f, 18.364f, 5.636f)
                curveTo(16.411f, 3.683f, 13.245f, 3.683f, 11.293f, 5.636f)
                lineTo(9.879f, 7.05f)
                lineTo(8.464f, 5.636f)
                lineTo(9.879f, 4.222f)
                curveTo(12.612f, 1.488f, 17.045f, 1.488f, 19.778f, 4.222f)
                curveTo(22.512f, 6.956f, 22.512f, 11.388f, 19.778f, 14.121f)
                lineTo(18.364f, 15.535f)
                close()
                moveTo(15.535f, 18.364f)
                lineTo(14.121f, 19.778f)
                curveTo(11.388f, 22.512f, 6.956f, 22.512f, 4.222f, 19.778f)
                curveTo(1.488f, 17.045f, 1.488f, 12.612f, 4.222f, 9.879f)
                lineTo(5.636f, 8.464f)
                lineTo(7.05f, 9.879f)
                lineTo(5.636f, 11.293f)
                curveTo(3.683f, 13.245f, 3.683f, 16.411f, 5.636f, 18.364f)
                curveTo(7.589f, 20.317f, 10.755f, 20.317f, 12.707f, 18.364f)
                lineTo(14.121f, 16.95f)
                lineTo(15.535f, 18.364f)
                close()
                moveTo(14.828f, 7.757f)
                lineTo(16.243f, 9.172f)
                lineTo(9.172f, 16.243f)
                lineTo(7.757f, 14.828f)
                lineTo(14.828f, 7.757f)
                close()
            }
        }
        .build()
        return _linkUnlink!!
    }

private var _linkUnlink: ImageVector? = null
