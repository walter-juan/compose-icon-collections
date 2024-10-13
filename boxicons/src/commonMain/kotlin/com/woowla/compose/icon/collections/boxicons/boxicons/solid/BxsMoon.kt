package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMoon: ImageVector
    get() {
        if (_bxsMoon != null) {
            return _bxsMoon!!
        }
        _bxsMoon = Builder(name = "BxsMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.807f)
                arcTo(9.002f, 9.002f, 0.0f, false, true, 10.049f, 2.0f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, false, -5.12f, 2.735f)
                curveToRelative(-3.905f, 3.905f, -3.905f, 10.237f, 0.0f, 14.142f)
                curveToRelative(3.906f, 3.906f, 10.237f, 3.905f, 14.143f, 0.0f)
                arcToRelative(9.946f, 9.946f, 0.0f, false, false, 2.735f, -5.119f)
                arcTo(9.003f, 9.003f, 0.0f, false, true, 12.0f, 11.807f)
                close()
            }
        }
        .build()
        return _bxsMoon!!
    }

private var _bxsMoon: ImageVector? = null
