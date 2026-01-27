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

public val SolidGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, -32.0f)
                curveToRelative(7.0f, 0.0f, 13.7f, 3.1f, 18.3f, 8.5f)
                lineToRelative(136.0f, 160.0f)
                curveToRelative(6.1f, 7.1f, 7.4f, 17.1f, 3.5f, 25.6f)
                reflectiveCurveTo(369.4f, 176.0f, 360.0f, 176.0f)
                lineToRelative(-24.9f, 0.0f)
                lineToRelative(75.2f, 88.5f)
                curveToRelative(6.1f, 7.1f, 7.4f, 17.1f, 3.5f, 25.6f)
                reflectiveCurveTo(401.4f, 304.0f, 392.0f, 304.0f)
                lineToRelative(-38.5f, 0.0f)
                lineToRelative(88.8f, 104.5f)
                curveToRelative(6.1f, 7.1f, 7.4f, 17.1f, 3.5f, 25.6f)
                reflectiveCurveTo(433.4f, 448.0f, 424.0f, 448.0f)
                lineToRelative(-168.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-168.0f, 0.0f)
                curveToRelative(-9.4f, 0.0f, -17.9f, -5.4f, -21.8f, -13.9f)
                reflectiveCurveToRelative(-2.6f, -18.5f, 3.5f, -25.6f)
                lineTo(94.5f, 304.0f)
                lineTo(56.0f, 304.0f)
                curveToRelative(-9.4f, 0.0f, -17.9f, -5.4f, -21.8f, -13.9f)
                reflectiveCurveToRelative(-2.6f, -18.5f, 3.5f, -25.6f)
                lineTo(112.9f, 176.0f)
                lineTo(88.0f, 176.0f)
                curveToRelative(-9.4f, 0.0f, -17.9f, -5.4f, -21.8f, -13.9f)
                reflectiveCurveToRelative(-2.6f, -18.5f, 3.5f, -25.6f)
                lineToRelative(136.0f, -160.0f)
                curveTo(210.3f, -28.9f, 217.0f, -32.0f, 224.0f, -32.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
