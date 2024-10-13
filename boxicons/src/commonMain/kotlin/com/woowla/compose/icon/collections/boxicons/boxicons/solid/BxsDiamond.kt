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

public val SolidGroup.BxsDiamond: ImageVector
    get() {
        if (_bxsDiamond != null) {
            return _bxsDiamond!!
        }
        _bxsDiamond = Builder(name = "BxsDiamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.445f, 3.0f)
                horizontalLineToRelative(-8.89f)
                curveToRelative(-0.345f, 0.0f, -0.666f, 0.178f, -0.849f, 0.47f)
                lineTo(3.25f, 9.0f)
                horizontalLineToRelative(17.5f)
                lineToRelative(-3.456f, -5.53f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.849f, -0.47f)
                close()
                moveTo(11.26f, 21.186f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.48f, 0.0f)
                lineTo(22.0f, 11.0f)
                horizontalLineTo(2.0f)
                lineToRelative(9.26f, 10.186f)
                close()
            }
        }
        .build()
        return _bxsDiamond!!
    }

private var _bxsDiamond: ImageVector? = null
