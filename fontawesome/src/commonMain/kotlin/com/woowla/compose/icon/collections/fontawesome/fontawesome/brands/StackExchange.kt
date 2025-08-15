package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.StackExchange: ImageVector
    get() {
        if (_stackExchange != null) {
            return _stackExchange!!
        }
        _stackExchange = Builder(name = "StackExchange", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 332.3f)
                lineToRelative(412.7f, 0.0f)
                lineToRelative(0.0f, 22.0f)
                curveToRelative(0.0f, 37.7f, -29.3f, 68.0f, -65.3f, 68.0f)
                lineToRelative(-19.0f, 0.0f)
                lineToRelative(-86.8f, 89.7f)
                lineToRelative(0.0f, -89.7f)
                lineToRelative(-176.3f, 0.0f)
                curveToRelative(-36.0f, 0.0f, -65.3f, -30.3f, -65.3f, -68.0f)
                lineToRelative(0.0f, -22.0f)
                close()
                moveTo(18.1f, 308.7f)
                lineToRelative(412.7f, 0.0f)
                lineToRelative(0.0f, -85.0f)
                lineToRelative(-412.7f, 0.0f)
                lineToRelative(0.0f, 85.0f)
                close()
                moveTo(18.1f, 199.3f)
                lineToRelative(412.7f, 0.0f)
                lineToRelative(0.0f, -85.0f)
                lineToRelative(-412.7f, 0.0f)
                lineToRelative(0.0f, 85.0f)
                close()
                moveTo(365.4f, 0.0f)
                lineTo(83.4f, 0.0f)
                curveToRelative(-36.0f, 0.0f, -65.3f, 30.3f, -65.3f, 67.7f)
                lineToRelative(0.0f, 22.3f)
                lineToRelative(412.7f, 0.0f)
                lineToRelative(0.0f, -22.3f)
                curveTo(430.7f, 30.3f, 401.4f, 0.0f, 365.4f, 0.0f)
                close()
            }
        }
        .build()
        return _stackExchange!!
    }

private var _stackExchange: ImageVector? = null
