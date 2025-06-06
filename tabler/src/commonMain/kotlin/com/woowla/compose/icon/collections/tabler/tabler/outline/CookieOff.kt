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

public val OutlineGroup.CookieOff: ImageVector
    get() {
        if (_cookieOff != null) {
            return _cookieOff!!
        }
        _cookieOff = Builder(name = "CookieOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.192f, 18.187f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.976f, 0.652f)
                curveToRelative(-1.048f, 0.263f, -1.787f, 0.483f, -2.216f, 0.661f)
                curveToRelative(-0.475f, 0.197f, -1.092f, 0.538f, -1.852f, 1.024f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.296f, 0.0f)
                curveToRelative(-0.802f, -0.503f, -1.419f, -0.844f, -1.852f, -1.024f)
                curveToRelative(-0.471f, -0.195f, -1.21f, -0.415f, -2.216f, -0.66f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.623f, -1.624f)
                curveToRelative(-0.265f, -1.052f, -0.485f, -1.79f, -0.661f, -2.216f)
                curveToRelative(-0.198f, -0.479f, -0.54f, -1.096f, -1.024f, -1.852f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -2.296f)
                curveToRelative(0.48f, -0.744f, 0.82f, -1.361f, 1.024f, -1.852f)
                curveToRelative(0.171f, -0.413f, 0.391f, -1.152f, 0.66f, -2.216f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.649f, -0.971f)
                moveToRelative(2.821f, -1.174f)
                curveToRelative(0.14f, -0.049f, 0.263f, -0.095f, 0.37f, -0.139f)
                curveToRelative(0.458f, -0.19f, 1.075f, -0.531f, 1.852f, -1.024f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.296f, 0.0f)
                lineToRelative(2.667f, 1.104f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.656f, 6.14f)
                lineToRelative(0.053f, 0.132f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 2.296f)
                curveToRelative(-0.497f, 0.786f, -0.838f, 1.404f, -1.024f, 1.852f)
                arcToRelative(6.579f, 6.579f, 0.0f, false, false, -0.135f, 0.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _cookieOff!!
    }

private var _cookieOff: ImageVector? = null
