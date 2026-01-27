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

public val SolidGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 24.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 112.0f, 0.0f)
                close()
                moveTo(272.0f, 236.7f)
                lineToRelative(46.3f, 62.4f)
                curveToRelative(10.5f, 14.2f, 30.6f, 17.2f, 44.8f, 6.6f)
                reflectiveCurveToRelative(17.2f, -30.6f, 6.6f, -44.8f)
                lineToRelative(-70.5f, -95.0f)
                curveTo(274.0f, 132.0f, 234.3f, 112.0f, 192.0f, 112.0f)
                reflectiveCurveToRelative(-82.0f, 20.0f, -107.2f, 53.9f)
                lineToRelative(-70.5f, 95.0f)
                curveToRelative(-10.5f, 14.2f, -7.6f, 34.2f, 6.6f, 44.8f)
                reflectiveCurveToRelative(34.2f, 7.6f, 44.8f, -6.6f)
                lineTo(112.0f, 236.7f)
                lineTo(112.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -275.3f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
