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

public val SolidGroup.BxsHeart: ImageVector
    get() {
        if (_bxsHeart != null) {
            return _bxsHeart!!
        }
        _bxsHeart = Builder(name = "BxsHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.205f, 4.791f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, false, -4.209f, -1.754f)
                arcTo(5.906f, 5.906f, 0.0f, false, false, 12.0f, 4.595f)
                arcToRelative(5.904f, 5.904f, 0.0f, false, false, -3.996f, -1.558f)
                arcToRelative(5.942f, 5.942f, 0.0f, false, false, -4.213f, 1.758f)
                curveToRelative(-2.353f, 2.363f, -2.352f, 6.059f, 0.002f, 8.412f)
                lineTo(12.0f, 21.414f)
                lineToRelative(8.207f, -8.207f)
                curveToRelative(2.354f, -2.353f, 2.355f, -6.049f, -0.002f, -8.416f)
                close()
            }
        }
        .build()
        return _bxsHeart!!
    }

private var _bxsHeart: ImageVector? = null
