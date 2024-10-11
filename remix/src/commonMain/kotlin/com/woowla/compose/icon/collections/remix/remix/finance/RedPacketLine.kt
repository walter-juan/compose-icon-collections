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

public val FinanceGroup.RedPacketLine: ImageVector
    get() {
        if (_redPacketLine != null) {
            return _redPacketLine!!
        }
        _redPacketLine = Builder(name = "RedPacketLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.178f, 9.766f)
                curveTo(16.033f, 9.355f, 17.695f, 8.428f, 19.005f, 7.144f)
                verticalLineTo(4.003f)
                horizontalLineTo(5.005f)
                verticalLineTo(7.144f)
                curveTo(6.315f, 8.428f, 7.976f, 9.355f, 9.832f, 9.766f)
                curveTo(10.262f, 9.011f, 11.074f, 8.503f, 12.005f, 8.503f)
                curveTo(12.936f, 8.503f, 13.748f, 9.011f, 14.178f, 9.766f)
                close()
                moveTo(14.386f, 11.767f)
                curveTo(14.063f, 12.774f, 13.119f, 13.503f, 12.005f, 13.503f)
                curveTo(10.891f, 13.503f, 9.946f, 12.774f, 9.624f, 11.767f)
                curveTo(7.927f, 11.425f, 6.36f, 10.726f, 5.005f, 9.751f)
                verticalLineTo(20.003f)
                horizontalLineTo(19.005f)
                verticalLineTo(9.751f)
                curveTo(17.649f, 10.726f, 16.083f, 11.425f, 14.386f, 11.767f)
                close()
                moveTo(4.005f, 2.003f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 2.003f, 21.005f, 2.451f, 21.005f, 3.003f)
                verticalLineTo(21.003f)
                curveTo(21.005f, 21.555f, 20.557f, 22.003f, 20.005f, 22.003f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.003f, 3.005f, 21.555f, 3.005f, 21.003f)
                verticalLineTo(3.003f)
                curveTo(3.005f, 2.451f, 3.453f, 2.003f, 4.005f, 2.003f)
                close()
            }
        }
        .build()
        return _redPacketLine!!
    }

private var _redPacketLine: ImageVector? = null
