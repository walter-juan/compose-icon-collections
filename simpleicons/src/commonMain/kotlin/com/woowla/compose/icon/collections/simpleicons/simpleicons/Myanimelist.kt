package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Myanimelist: ImageVector
    get() {
        if (_myanimelist != null) {
            return _myanimelist!!
        }
        _myanimelist = Builder(name = "Myanimelist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.921f, 6.479f)
                curveToRelative(-0.82f, 0.0f, -3.683f, 0.0f, -4.947f, 3.156f)
                curveToRelative(-0.662f, 1.652f, -0.986f, 4.812f, 0.876f, 7.886f)
                lineToRelative(1.934f, -1.41f)
                reflectiveCurveToRelative(-0.767f, -1.095f, -1.083f, -3.191f)
                horizontalLineToRelative(2.897f)
                lineToRelative(0.022f, 3.19f)
                horizontalLineToRelative(2.604f)
                lineTo(17.224f, 8.835f)
                horizontalLineToRelative(-2.581f)
                verticalLineToRelative(2.043f)
                lineToRelative(-2.46f, -0.023f)
                reflectiveCurveToRelative(0.413f, -2.408f, 2.877f, -2.336f)
                horizontalLineToRelative(2.454f)
                lineToRelative(-0.572f, -2.04f)
                close()
                moveTo(0.0f, 6.528f)
                verticalLineToRelative(9.624f)
                horizontalLineToRelative(2.348f)
                verticalLineToRelative(-5.84f)
                lineToRelative(2.031f, 2.664f)
                lineToRelative(2.047f, -2.652f)
                verticalLineToRelative(5.828f)
                horizontalLineToRelative(2.336f)
                lineTo(8.762f, 6.528f)
                lineTo(6.437f, 6.528f)
                lineTo(4.368f, 9.474f)
                lineTo(2.31f, 6.528f)
                close()
                moveTo(18.447f, 6.55f)
                verticalLineToRelative(9.583f)
                horizontalLineToRelative(5.022f)
                lineTo(24.0f, 14.09f)
                horizontalLineToRelative(-3.232f)
                lineTo(20.768f, 6.55f)
                close()
            }
        }
        .build()
        return _myanimelist!!
    }

private var _myanimelist: ImageVector? = null
