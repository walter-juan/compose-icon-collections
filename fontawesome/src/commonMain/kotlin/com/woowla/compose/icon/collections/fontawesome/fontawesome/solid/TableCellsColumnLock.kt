package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.TableCellsColumnLock: ImageVector
    get() {
        if (_tableCellsColumnLock != null) {
            return _tableCellsColumnLock!!
        }
        _tableCellsColumnLock = Builder(name = "TableCellsColumnLock", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 224.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(512.0f, 145.0f)
                curveToRelative(-46.7f, 5.8f, -85.6f, 36.8f, -102.7f, 79.0f)
                lineToRelative(-25.3f, 0.0f)
                lineToRelative(0.0f, 90.8f)
                curveToRelative(-10.1f, 15.2f, -16.0f, 33.4f, -16.0f, 53.1f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 5.5f, 0.5f, 10.9f, 1.3f, 16.1f)
                lineTo(128.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(64.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 49.0f)
                close()
                moveTo(128.0f, 224.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(560.0f, 272.1f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                close()
                moveTo(416.0f, 368.0f)
                curveToRelative(0.0f, -20.9f, 13.4f, -38.7f, 32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(18.6f, 6.6f, 32.0f, 24.4f, 32.0f, 45.3f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _tableCellsColumnLock!!
    }

private var _tableCellsColumnLock: ImageVector? = null
