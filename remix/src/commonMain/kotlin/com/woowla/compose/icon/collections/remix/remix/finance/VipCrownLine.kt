package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.VipCrownLine: ImageVector
    get() {
        if (_vipCrownLine != null) {
            return _vipCrownLine!!
        }
        _vipCrownLine = Builder(name = "VipCrownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.005f, 19.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.005f, 5.0f)
                lineTo(7.005f, 8.5f)
                lineTo(12.005f, 2.0f)
                lineTo(17.005f, 8.5f)
                lineTo(22.005f, 5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(5.0f)
                close()
                moveTo(4.005f, 8.841f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.005f)
                verticalLineTo(8.841f)
                lineTo(16.585f, 11.235f)
                lineTo(12.005f, 5.28f)
                lineTo(7.424f, 11.235f)
                lineTo(4.005f, 8.841f)
                close()
            }
        }
        .build()
        return _vipCrownLine!!
    }

private var _vipCrownLine: ImageVector? = null
