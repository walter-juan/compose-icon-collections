package com.woowla.compose.icon.collections.heroicons.heroicons.outline

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
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) {
            return _ellipsisVertical!!
        }
        _ellipsisVertical = Builder(name = "EllipsisVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.75f)
                curveTo(11.586f, 6.75f, 11.25f, 6.414f, 11.25f, 6.0f)
                curveTo(11.25f, 5.586f, 11.586f, 5.25f, 12.0f, 5.25f)
                curveTo(12.414f, 5.25f, 12.75f, 5.586f, 12.75f, 6.0f)
                curveTo(12.75f, 6.414f, 12.414f, 6.75f, 12.0f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.75f)
                curveTo(11.586f, 12.75f, 11.25f, 12.414f, 11.25f, 12.0f)
                curveTo(11.25f, 11.586f, 11.586f, 11.25f, 12.0f, 11.25f)
                curveTo(12.414f, 11.25f, 12.75f, 11.586f, 12.75f, 12.0f)
                curveTo(12.75f, 12.414f, 12.414f, 12.75f, 12.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(11.586f, 18.75f, 11.25f, 18.414f, 11.25f, 18.0f)
                curveTo(11.25f, 17.586f, 11.586f, 17.25f, 12.0f, 17.25f)
                curveTo(12.414f, 17.25f, 12.75f, 17.586f, 12.75f, 18.0f)
                curveTo(12.75f, 18.414f, 12.414f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
        .build()
        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
