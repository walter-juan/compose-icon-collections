package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ContractLeftLine: ImageVector
    get() {
        if (_contractLeftLine != null) {
            return _contractLeftLine!!
        }
        _contractLeftLine = Builder(name = "ContractLeftLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.071f, 4.929f)
                lineTo(16.485f, 6.343f)
                lineTo(11.829f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 13.0f)
                lineTo(11.829f, 13.0f)
                lineTo(16.485f, 17.657f)
                lineTo(15.071f, 19.071f)
                lineTo(8.0f, 12.0f)
                lineTo(15.071f, 4.929f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 19.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _contractLeftLine!!
    }

private var _contractLeftLine: ImageVector? = null
