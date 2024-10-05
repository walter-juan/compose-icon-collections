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

public val OutlineGroup.BrandBaidu: ImageVector
    get() {
        if (_brandBaidu != null) {
            return _brandBaidu!!
        }
        _brandBaidu = Builder(name = "BrandBaidu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 9.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.463f, 11.596f)
                curveToRelative(1.282f, 1.774f, 3.476f, 3.416f, 3.476f, 3.416f)
                reflectiveCurveToRelative(1.921f, 1.574f, 0.593f, 3.636f)
                curveToRelative(-1.328f, 2.063f, -4.892f, 1.152f, -4.892f, 1.152f)
                reflectiveCurveToRelative(-1.416f, -0.44f, -3.06f, -0.088f)
                curveToRelative(-1.644f, 0.356f, -3.06f, 0.22f, -3.06f, 0.22f)
                reflectiveCurveToRelative(-2.055f, -0.22f, -2.47f, -2.304f)
                curveToRelative(-0.416f, -2.084f, 1.918f, -3.638f, 2.102f, -3.858f)
                curveToRelative(0.182f, -0.222f, 1.409f, -0.966f, 2.284f, -2.394f)
                curveToRelative(0.875f, -1.428f, 3.337f, -2.287f, 5.027f, 0.221f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
            }
        }
        .build()
        return _brandBaidu!!
    }

private var _brandBaidu: ImageVector? = null