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

public val EditorGroup.MindMap: ImageVector
    get() {
        if (_mindMap != null) {
            return _mindMap!!
        }
        _mindMap = Builder(name = "MindMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                curveTo(21.0f, 7.657f, 19.657f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(13.694f, 9.0f, 12.583f, 8.166f, 12.171f, 7.001f)
                lineTo(11.0f, 7.0f)
                curveTo(9.9f, 7.0f, 9.0f, 7.9f, 9.0f, 9.0f)
                lineTo(9.001f, 9.171f)
                curveTo(10.166f, 9.583f, 11.0f, 10.694f, 11.0f, 12.0f)
                curveTo(11.0f, 13.306f, 10.166f, 14.417f, 9.001f, 14.829f)
                lineTo(9.0f, 15.0f)
                curveTo(9.0f, 16.1f, 9.9f, 17.0f, 11.0f, 17.0f)
                lineTo(12.171f, 17.0f)
                curveTo(12.583f, 15.835f, 13.694f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 15.0f, 21.0f, 16.343f, 21.0f, 18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(13.694f, 21.0f, 12.583f, 20.166f, 12.171f, 19.001f)
                lineTo(11.0f, 19.0f)
                curveTo(8.79f, 19.0f, 7.0f, 17.21f, 7.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 15.0f, 2.0f, 13.657f, 2.0f, 12.0f)
                curveTo(2.0f, 10.343f, 3.343f, 9.0f, 5.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 6.791f, 8.791f, 5.0f, 11.0f, 5.0f)
                lineTo(12.171f, 5.0f)
                curveTo(12.583f, 3.835f, 13.694f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(14.448f, 17.0f, 14.0f, 17.448f, 14.0f, 18.0f)
                curveTo(14.0f, 18.552f, 14.448f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                curveTo(19.0f, 17.448f, 18.552f, 17.0f, 18.0f, 17.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 11.0f, 4.0f, 11.448f, 4.0f, 12.0f)
                curveTo(4.0f, 12.552f, 4.448f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 13.0f, 9.0f, 12.552f, 9.0f, 12.0f)
                curveTo(9.0f, 11.448f, 8.552f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(14.448f, 5.0f, 14.0f, 5.448f, 14.0f, 6.0f)
                curveTo(14.0f, 6.552f, 14.448f, 7.0f, 15.0f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 7.0f, 19.0f, 6.552f, 19.0f, 6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _mindMap!!
    }

private var _mindMap: ImageVector? = null
