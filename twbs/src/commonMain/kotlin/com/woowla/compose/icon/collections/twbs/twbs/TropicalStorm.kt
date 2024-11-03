package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TropicalStorm: ImageVector
    get() {
        if (_tropicalStorm != null) {
            return _tropicalStorm!!
        }
        _tropicalStorm = Builder(name = "TropicalStorm", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveToRelative(-0.9f, 0.0f, -1.75f, 0.216f, -2.501f, 0.6f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 7.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 8.001f, 4.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 7.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 9.5f, 2.0f)
                moveTo(8.0f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
            }
        }
        .build()
        return _tropicalStorm!!
    }

private var _tropicalStorm: ImageVector? = null
