package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.Save2Line: ImageVector
    get() {
        if (_save2Line != null) {
            return _save2Line!!
        }
        _save2Line = Builder(name = "Save2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.828f)
                lineTo(16.172f, 5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(17.0f)
                lineTo(20.707f, 6.707f)
                curveTo(20.895f, 6.895f, 21.0f, 7.149f, 21.0f, 7.414f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.343f, 18.0f, 9.0f, 16.657f, 9.0f, 15.0f)
                curveTo(9.0f, 13.343f, 10.343f, 12.0f, 12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 13.343f, 15.0f, 15.0f)
                curveTo(15.0f, 16.657f, 13.657f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _save2Line!!
    }

private var _save2Line: ImageVector? = null
