package com.woowla.compose.icon.collections.remix.remix.gameandsports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.GameAndSportsGroup

public val GameAndSportsGroup.BaseballFill: ImageVector
    get() {
        if (_baseballFill != null) {
            return _baseballFill!!
        }
        _baseballFill = Builder(name = "BaseballFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                curveTo(19.15f, 4.581f, 20.663f, 6.5f, 21.428f, 8.671f)
                curveTo(18.656f, 9.189f, 16.119f, 10.867f, 14.599f, 13.5f)
                curveTo(13.078f, 16.133f, 12.894f, 19.169f, 13.832f, 21.828f)
                curveTo(11.569f, 22.251f, 9.15f, 21.902f, 7.0f, 20.66f)
                curveTo(4.851f, 19.419f, 3.339f, 17.499f, 2.573f, 15.328f)
                curveTo(5.345f, 14.81f, 7.882f, 13.133f, 9.402f, 10.5f)
                curveTo(10.923f, 7.867f, 11.107f, 4.83f, 10.17f, 2.171f)
                curveTo(12.432f, 1.749f, 14.851f, 2.099f, 17.0f, 3.34f)
                close()
                moveTo(8.248f, 2.733f)
                curveTo(9.04f, 4.884f, 8.906f, 7.359f, 7.67f, 9.5f)
                curveTo(6.434f, 11.641f, 4.358f, 12.993f, 2.099f, 13.383f)
                curveTo(1.799f, 11.251f, 2.181f, 9.008f, 3.34f, 7.0f)
                curveTo(4.5f, 4.991f, 6.252f, 3.539f, 8.248f, 2.733f)
                close()
                moveTo(21.902f, 10.616f)
                curveTo(22.201f, 12.748f, 21.82f, 14.991f, 20.661f, 17.0f)
                curveTo(19.501f, 19.009f, 17.749f, 20.459f, 15.753f, 21.266f)
                curveTo(14.961f, 19.115f, 15.095f, 16.641f, 16.33f, 14.5f)
                curveTo(17.566f, 12.359f, 19.642f, 11.006f, 21.902f, 10.616f)
                close()
            }
        }
        .build()
        return _baseballFill!!
    }

private var _baseballFill: ImageVector? = null
