package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.LocationBolt: ImageVector
    get() {
        if (_locationBolt != null) {
            return _locationBolt!!
        }
        _locationBolt = Builder(name = "LocationBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.05f, 20.1f)
                lineToRelative(-3.05f, -6.1f)
                lineToRelative(-7.0f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(18.0f, -6.5f)
                lineToRelative(-3.312f, 9.173f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, 3.0f)
            }
        }
        .build()
        return _locationBolt!!
    }

private var _locationBolt: ImageVector? = null
