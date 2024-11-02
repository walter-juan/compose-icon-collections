package com.woowla.compose.icon.collections.ionicons.ionicons.outline

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
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(392.0f, 344.0f)
                moveToRelative(-88.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -176.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 344.0f)
                moveToRelative(-88.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -176.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 344.0f)
                verticalLineTo(128.0f)
                curveTo(208.0f, 101.5f, 192.0f, 80.0f, 164.0f, 80.0f)
                curveTo(129.0f, 80.0f, 117.5f, 101.5f, 107.0f, 128.0f)
                curveTo(107.0f, 128.0f, 58.5f, 255.83f, 36.0f, 317.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 184.0f)
                curveTo(208.0f, 184.0f, 224.5f, 176.0f, 256.0f, 176.0f)
                curveTo(287.5f, 176.0f, 304.0f, 184.0f, 304.0f, 184.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 272.0f)
                curveTo(208.0f, 272.0f, 224.5f, 264.0f, 256.0f, 264.0f)
                curveTo(287.5f, 264.0f, 304.0f, 272.0f, 304.0f, 272.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 344.0f)
                verticalLineTo(128.0f)
                curveTo(304.0f, 101.5f, 320.0f, 80.0f, 348.0f, 80.0f)
                curveTo(383.0f, 80.0f, 394.5f, 101.5f, 405.0f, 128.0f)
                curveTo(405.0f, 128.0f, 453.5f, 255.83f, 476.0f, 317.5f)
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
