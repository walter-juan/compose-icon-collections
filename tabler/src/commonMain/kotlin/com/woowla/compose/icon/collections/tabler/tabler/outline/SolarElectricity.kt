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

public val OutlineGroup.SolarElectricity: ImageVector
    get() {
        if (_solarElectricity != null) {
            return _solarElectricity!!
        }
        _solarElectricity = Builder(name = "SolarElectricity", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.28f)
                verticalLineToRelative(11.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.243f, 0.97f)
                lineToRelative(6.0f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.757f, -0.97f)
                verticalLineToRelative(-8.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.757f, -0.97f)
                lineToRelative(-6.0f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.243f, 0.97f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(-3.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-3.0f, 5.0f)
            }
        }
        .build()
        return _solarElectricity!!
    }

private var _solarElectricity: ImageVector? = null
