package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) {
            return _chartFunnel!!
        }
        _chartFunnel = Builder(name = "ChartFunnel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.387f, 3.0f)
                horizontalLineToRelative(15.226f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.948f, 1.316f)
                lineToRelative(-5.105f, 15.316f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.898f, 1.368f)
                horizontalLineToRelative(-3.116f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.898f, -1.368f)
                lineToRelative(-5.104f, -15.316f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.947f, -1.316f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                horizontalLineToRelative(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(10.0f)
            }
        }
        .build()
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
