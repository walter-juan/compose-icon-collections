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

public val OthersGroup.BilliardsFill: ImageVector
    get() {
        if (_billiardsFill != null) {
            return _billiardsFill!!
        }
        _billiardsFill = Builder(name = "BilliardsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(8.686f, 6.0f, 6.0f, 8.686f, 6.0f, 12.0f)
                curveTo(6.0f, 15.314f, 8.686f, 18.0f, 12.0f, 18.0f)
                curveTo(15.314f, 18.0f, 18.0f, 15.314f, 18.0f, 12.0f)
                curveTo(18.0f, 8.686f, 15.314f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(13.381f, 7.75f, 14.5f, 8.869f, 14.5f, 10.25f)
                curveTo(14.5f, 10.882f, 14.266f, 11.458f, 13.88f, 11.898f)
                curveTo(14.445f, 12.354f, 14.8f, 13.015f, 14.8f, 13.75f)
                curveTo(14.8f, 15.131f, 13.546f, 16.25f, 12.0f, 16.25f)
                curveTo(10.454f, 16.25f, 9.2f, 15.131f, 9.2f, 13.75f)
                curveTo(9.2f, 13.015f, 9.555f, 12.354f, 10.121f, 11.897f)
                curveTo(9.734f, 11.458f, 9.5f, 10.882f, 9.5f, 10.25f)
                curveTo(9.5f, 8.869f, 10.619f, 7.75f, 12.0f, 7.75f)
                close()
                moveTo(12.0f, 12.75f)
                curveTo(11.247f, 12.75f, 10.7f, 13.238f, 10.7f, 13.75f)
                curveTo(10.7f, 14.262f, 11.247f, 14.75f, 12.0f, 14.75f)
                curveTo(12.753f, 14.75f, 13.3f, 14.262f, 13.3f, 13.75f)
                curveTo(13.3f, 13.238f, 12.753f, 12.75f, 12.0f, 12.75f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(11.448f, 9.25f, 11.0f, 9.698f, 11.0f, 10.25f)
                curveTo(11.0f, 10.802f, 11.448f, 11.25f, 12.0f, 11.25f)
                curveTo(12.552f, 11.25f, 13.0f, 10.802f, 13.0f, 10.25f)
                curveTo(13.0f, 9.698f, 12.552f, 9.25f, 12.0f, 9.25f)
                close()
            }
        }
        .build()
        return _billiardsFill!!
    }

private var _billiardsFill: ImageVector? = null
