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

public val ArrowsGroup.ContractLeftRightFill: ImageVector
    get() {
        if (_contractLeftRightFill != null) {
            return _contractLeftRightFill!!
        }
        _contractLeftRightFill = Builder(name = "ContractLeftRightFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                lineTo(11.0f, 12.0f)
                lineTo(5.0f, 6.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(13.0f, 12.0f)
                lineTo(19.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _contractLeftRightFill!!
    }

private var _contractLeftRightFill: ImageVector? = null
