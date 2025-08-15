package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 87.1f)
                lineToRelative(15.0f, 20.7f)
                lineToRelative(15.0f, -20.7f)
                curveTo(296.0f, 52.5f, 336.2f, 32.0f, 378.9f, 32.0f)
                curveTo(452.4f, 32.0f, 512.0f, 91.6f, 512.0f, 165.1f)
                lineToRelative(0.0f, 2.6f)
                curveToRelative(0.0f, 112.2f, -139.9f, 242.5f, -212.9f, 298.2f)
                curveToRelative(-12.4f, 9.4f, -27.6f, 14.1f, -43.1f, 14.1f)
                reflectiveCurveToRelative(-30.8f, -4.6f, -43.1f, -14.1f)
                curveTo(139.9f, 410.2f, 0.0f, 279.9f, 0.0f, 167.7f)
                lineToRelative(0.0f, -2.6f)
                curveTo(0.0f, 91.6f, 59.6f, 32.0f, 133.1f, 32.0f)
                curveTo(175.8f, 32.0f, 216.0f, 52.5f, 241.0f, 87.1f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
