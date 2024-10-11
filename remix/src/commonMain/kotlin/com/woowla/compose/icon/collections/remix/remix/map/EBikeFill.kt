package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.EBikeFill: ImageVector
    get() {
        if (_eBikeFill != null) {
            return _eBikeFill!!
        }
        _eBikeFill = Builder(name = "EBikeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.501f, 6.937f)
                curveTo(17.593f, 8.147f, 19.0f, 10.409f, 19.0f, 13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.829f)
                curveTo(14.417f, 22.165f, 13.306f, 23.0f, 12.0f, 23.0f)
                curveTo(10.694f, 23.0f, 9.583f, 22.165f, 9.171f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 10.409f, 6.407f, 8.147f, 8.499f, 6.937f)
                curveTo(8.338f, 6.645f, 8.211f, 6.331f, 8.126f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.126f)
                curveTo(8.57f, 2.275f, 10.136f, 1.0f, 12.0f, 1.0f)
                curveTo(13.864f, 1.0f, 15.43f, 2.275f, 15.874f, 4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.874f)
                curveTo(15.789f, 6.331f, 15.663f, 6.645f, 15.501f, 6.937f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(11.448f, 14.0f, 11.0f, 14.448f, 11.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.552f, 11.448f, 21.0f, 12.0f, 21.0f)
                curveTo(12.552f, 21.0f, 13.0f, 20.552f, 13.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 14.448f, 12.552f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.105f, 7.0f, 14.0f, 6.105f, 14.0f, 5.0f)
                curveTo(14.0f, 3.895f, 13.105f, 3.0f, 12.0f, 3.0f)
                curveTo(10.895f, 3.0f, 10.0f, 3.895f, 10.0f, 5.0f)
                curveTo(10.0f, 6.105f, 10.895f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _eBikeFill!!
    }

private var _eBikeFill: ImageVector? = null
