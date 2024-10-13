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

public val SolidGroup.BxsShare: ImageVector
    get() {
        if (_bxsShare != null) {
            return _bxsShare!!
        }
        _bxsShare = Builder(name = "BxsShare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.914f)
                verticalLineTo(2.586f)
                lineTo(6.293f, 7.293f)
                lineToRelative(-3.774f, 3.774f)
                lineToRelative(3.841f, 3.201f)
                lineTo(11.0f, 18.135f)
                verticalLineTo(13.9f)
                curveToRelative(8.146f, -0.614f, 11.0f, 4.1f, 11.0f, 4.1f)
                curveToRelative(0.0f, -2.937f, -0.242f, -5.985f, -2.551f, -8.293f)
                curveTo(16.765f, 7.022f, 12.878f, 6.832f, 11.0f, 6.914f)
                close()
            }
        }
        .build()
        return _bxsShare!!
    }

private var _bxsShare: ImageVector? = null
