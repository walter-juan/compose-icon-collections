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

public val ArrowsGroup.ContractRightFill: ImageVector
    get() {
        if (_contractRightFill != null) {
            return _contractRightFill!!
        }
        _contractRightFill = Builder(name = "ContractRightFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                lineTo(16.0f, 12.0f)
                lineTo(9.0f, 19.0f)
                verticalLineTo(13.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 19.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _contractRightFill!!
    }

private var _contractRightFill: ImageVector? = null