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

public val OutlineGroup.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.813f, 15.904f)
                lineTo(9.0f, 18.75f)
                lineTo(8.187f, 15.904f)
                curveTo(7.76f, 14.409f, 6.591f, 13.24f, 5.096f, 12.813f)
                lineTo(2.25f, 12.0f)
                lineTo(5.096f, 11.187f)
                curveTo(6.591f, 10.76f, 7.76f, 9.591f, 8.187f, 8.096f)
                lineTo(9.0f, 5.25f)
                lineTo(9.813f, 8.096f)
                curveTo(10.24f, 9.591f, 11.409f, 10.76f, 12.904f, 11.187f)
                lineTo(15.75f, 12.0f)
                lineTo(12.904f, 12.813f)
                curveTo(11.409f, 13.24f, 10.24f, 14.409f, 9.813f, 15.904f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.259f, 8.715f)
                lineTo(18.0f, 9.75f)
                lineTo(17.741f, 8.715f)
                curveTo(17.439f, 7.505f, 16.495f, 6.561f, 15.285f, 6.259f)
                lineTo(14.25f, 6.0f)
                lineTo(15.285f, 5.741f)
                curveTo(16.495f, 5.439f, 17.439f, 4.495f, 17.741f, 3.285f)
                lineTo(18.0f, 2.25f)
                lineTo(18.259f, 3.285f)
                curveTo(18.561f, 4.495f, 19.505f, 5.439f, 20.715f, 5.741f)
                lineTo(21.75f, 6.0f)
                lineTo(20.715f, 6.259f)
                curveTo(19.505f, 6.561f, 18.561f, 7.505f, 18.259f, 8.715f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.894f, 20.567f)
                lineTo(16.5f, 21.75f)
                lineTo(16.106f, 20.567f)
                curveTo(15.882f, 19.895f, 15.355f, 19.368f, 14.683f, 19.144f)
                lineTo(13.5f, 18.75f)
                lineTo(14.683f, 18.356f)
                curveTo(15.355f, 18.132f, 15.882f, 17.605f, 16.106f, 16.933f)
                lineTo(16.5f, 15.75f)
                lineTo(16.894f, 16.933f)
                curveTo(17.118f, 17.605f, 17.645f, 18.132f, 18.317f, 18.356f)
                lineTo(19.5f, 18.75f)
                lineTo(18.317f, 19.144f)
                curveTo(17.645f, 19.368f, 17.118f, 19.895f, 16.894f, 20.567f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
