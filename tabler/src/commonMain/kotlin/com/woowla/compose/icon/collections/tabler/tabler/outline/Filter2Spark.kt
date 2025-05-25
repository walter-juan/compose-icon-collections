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

public val OutlineGroup.Filter2Spark: ImageVector
    get() {
        if (_filter2Spark != null) {
            return _filter2Spark!!
        }
        _filter2Spark = Builder(name = "Filter2Spark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 21.5f)
                curveToRelative(0.205f, -0.849f, 0.641f, -1.625f, 1.258f, -2.242f)
                curveToRelative(0.617f, -0.617f, 1.393f, -1.053f, 2.242f, -1.258f)
                curveToRelative(-0.849f, -0.205f, -1.625f, -0.641f, -2.242f, -1.258f)
                curveToRelative(-0.617f, -0.617f, -1.053f, -1.393f, -1.258f, -2.242f)
                curveToRelative(-0.205f, 0.849f, -0.641f, 1.625f, -1.258f, 2.242f)
                curveToRelative(-0.617f, 0.617f, -1.393f, 1.053f, -2.242f, 1.258f)
                curveToRelative(0.849f, 0.205f, 1.625f, 0.641f, 2.242f, 1.258f)
                curveToRelative(0.617f, 0.617f, 1.053f, 1.393f, 1.258f, 2.242f)
                close()
            }
        }
        .build()
        return _filter2Spark!!
    }

private var _filter2Spark: ImageVector? = null
