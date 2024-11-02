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

public val Simpleicons.Contributorcovenant: ImageVector
    get() {
        if (_contributorcovenant != null) {
            return _contributorcovenant!!
        }
        _contributorcovenant = Builder(name = "Contributorcovenant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.688f, 0.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.624f, -6.412f)
                arcToRelative(10.484f, 10.484f, 0.0f, false, true, -8.374f, 4.162f)
                curveToRelative(-5.799f, 0.0f, -10.5f, -4.701f, -10.5f, -10.5f)
                reflectiveCurveTo(9.14f, 0.75f, 14.938f, 0.75f)
                curveToRelative(1.001f, 0.0f, 1.97f, 0.14f, 2.887f, 0.402f)
                arcTo(11.956f, 11.956f, 0.0f, false, false, 12.688f, 0.0f)
                close()
                moveTo(15.126f, 2.25f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 7.967f, 13.19f)
                arcToRelative(7.875f, 7.875f, 0.0f, true, true, -4.115f, -12.326f)
                arcToRelative(8.962f, 8.962f, 0.0f, false, false, -3.852f, -0.864f)
                close()
            }
        }
        .build()
        return _contributorcovenant!!
    }

private var _contributorcovenant: ImageVector? = null
