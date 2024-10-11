package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.FridgeFill: ImageVector
    get() {
        if (_fridgeFill != null) {
            return _fridgeFill!!
        }
        _fridgeFill = Builder(name = "FridgeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.998f, 12.0f)
                verticalLineTo(22.0f)
                curveTo(19.998f, 22.552f, 19.55f, 23.0f, 18.998f, 23.0f)
                horizontalLineTo(4.998f)
                curveTo(4.446f, 23.0f, 3.998f, 22.552f, 3.998f, 22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.998f)
                close()
                moveTo(8.998f, 14.0f)
                horizontalLineTo(6.998f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.998f)
                verticalLineTo(14.0f)
                close()
                moveTo(18.998f, 1.0f)
                curveTo(19.55f, 1.0f, 19.998f, 1.448f, 19.998f, 2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.998f)
                verticalLineTo(2.0f)
                curveTo(3.998f, 1.448f, 4.446f, 1.0f, 4.998f, 1.0f)
                horizontalLineTo(18.998f)
                close()
                moveTo(8.998f, 4.0f)
                horizontalLineTo(6.998f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.998f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _fridgeFill!!
    }

private var _fridgeFill: ImageVector? = null
