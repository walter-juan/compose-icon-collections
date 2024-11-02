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
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 65.1f)
                curveToRelative(-37.8f, 5.4f, -69.4f, 29.6f, -85.2f, 62.9f)
                lineTo(360.0f, 224.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(56.0f, 0.0f)
                lineToRelative(0.0f, 8.6f)
                curveToRelative(-19.1f, 11.1f, -32.0f, 31.7f, -32.0f, 55.4f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(208.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-88.0f, 0.0f)
                close()
                moveTo(448.0f, 96.0f)
                lineToRelative(-88.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(208.0f, 224.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-88.0f, 0.0f)
                close()
                moveTo(208.0f, 352.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-88.0f, 0.0f)
                close()
                moveTo(528.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(448.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _tableCellsColumnLock!!
    }

private var _tableCellsColumnLock: ImageVector? = null
