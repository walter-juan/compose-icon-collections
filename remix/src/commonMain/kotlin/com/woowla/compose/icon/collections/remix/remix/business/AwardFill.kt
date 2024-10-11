package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.AwardFill: ImageVector
    get() {
        if (_awardFill != null) {
            return _awardFill!!
        }
        _awardFill = Builder(name = "AwardFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.245f)
                verticalLineTo(22.117f)
                curveTo(17.0f, 22.393f, 16.776f, 22.617f, 16.5f, 22.617f)
                curveTo(16.409f, 22.617f, 16.32f, 22.592f, 16.243f, 22.546f)
                lineTo(12.0f, 20.0f)
                lineTo(7.757f, 22.546f)
                curveTo(7.52f, 22.688f, 7.213f, 22.611f, 7.071f, 22.374f)
                curveTo(7.025f, 22.296f, 7.0f, 22.208f, 7.0f, 22.117f)
                verticalLineTo(15.245f)
                curveTo(5.171f, 13.779f, 4.0f, 11.526f, 4.0f, 9.0f)
                curveTo(4.0f, 4.582f, 7.582f, 1.0f, 12.0f, 1.0f)
                curveTo(16.418f, 1.0f, 20.0f, 4.582f, 20.0f, 9.0f)
                curveTo(20.0f, 11.526f, 18.829f, 13.779f, 17.0f, 15.245f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(15.314f, 15.0f, 18.0f, 12.314f, 18.0f, 9.0f)
                curveTo(18.0f, 5.686f, 15.314f, 3.0f, 12.0f, 3.0f)
                curveTo(8.686f, 3.0f, 6.0f, 5.686f, 6.0f, 9.0f)
                curveTo(6.0f, 12.314f, 8.686f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(9.791f, 13.0f, 8.0f, 11.209f, 8.0f, 9.0f)
                curveTo(8.0f, 6.791f, 9.791f, 5.0f, 12.0f, 5.0f)
                curveTo(14.209f, 5.0f, 16.0f, 6.791f, 16.0f, 9.0f)
                curveTo(16.0f, 11.209f, 14.209f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _awardFill!!
    }

private var _awardFill: ImageVector? = null
